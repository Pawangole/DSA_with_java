package mapstries
;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class TrieNode {
    public char value;
    public HashMap<Character, TrieNode> children;
    public boolean isTerminal;

    public TrieNode(char data) {
        this.value = data;
        this.children = new HashMap<>();
        this.isTerminal = false;
    }
}

// Trie Operations
public class Trie {

    // Insert a word into the Trie
    public void insertIntoTrie(TrieNode root, String word) {
        if (word.length() == 0) {
            root.isTerminal = true;
            return;
        }

        char ch = word.charAt(0);
        TrieNode child;

        // If present, move to the next character, else create a new TrieNode
        if (root.children.containsKey(ch)) {
            child = root.children.get(ch);
        } else {
            child = new TrieNode(ch);
            root.children.put(ch, child);
        }

        // Recursive call for the remaining part of the word
        insertIntoTrie(child, word.substring(1));
    }

    // Search a word in the Trie
    public boolean searchTrie(TrieNode root, String word) {
        if (word.length() == 0) {
            return root.isTerminal;
        }

        char ch = word.charAt(0);
        TrieNode child;

        // If present, continue searching
        if (root.children.containsKey(ch)) {
            child = root.children.get(ch);
        } else {
            return false; // Word not present
        }

        return searchTrie(child, word.substring(1));
    }

    // Delete a word from the Trie
    public void deleteWord(TrieNode root, String word) {
        if (word.length() == 0) {
            root.isTerminal = false;
            return;
        }

        char ch = word.charAt(0);
        TrieNode child;

        if (root.children.containsKey(ch)) {
            child = root.children.get(ch);
        } else {
            return; // Word not found
        }

        deleteWord(child, word.substring(1));
    }

    // Store all strings starting from the given Trie node
    public void storeString(TrieNode root, List<String> ans, String output) {
        if (root.isTerminal) {
            ans.add(output);
        }

        // Traverse the children and store all strings
        for (char ch : root.children.keySet()) {
            TrieNode child = root.children.get(ch);
            storeString(child, ans, output + ch);
        }
    }

    // Find all words with the given prefix
    public void findWordsWithPrefix(TrieNode root, String prefix, List<String> ans) {
        if (prefix.length() == 0) {
            storeString(root, ans, "");
            return;
        }

        char ch = prefix.charAt(0);
        TrieNode child;

        if (root.children.containsKey(ch)) {
            child = root.children.get(ch);
        } else {
            return;
        }

        findWordsWithPrefix(child, prefix.substring(1), ans);
    }

    // Get all suggestions based on a prefix
    public List<List<String>> getSuggestions(TrieNode root, String prefix) {
        List<List<String>> ans = new ArrayList<>();
        String temp = "";

        for (int i = 0; i < prefix.length(); i++) {
            List<String> tempAns = new ArrayList<>();
            char currChar = prefix.charAt(i);
            temp += currChar;

            findWordsWithPrefix(root, temp, tempAns);

            // Add the prefix in front of each suggestion
            for (int j = 0; j < tempAns.size(); j++) {
                tempAns.set(j, temp + tempAns.get(j));
            }

            ans.add(tempAns);
        }

        return ans;
    }

    public static void main(String[] args) {
        TrieNode root = new TrieNode('-');
        Trie trie = new Trie();

        trie.insertIntoTrie(root, "babbar");
        trie.insertIntoTrie(root, "baby");
        trie.insertIntoTrie(root, "baba");
        trie.insertIntoTrie(root, "bala");

        String prefix = "bal";
        List<List<String>> ans = trie.getSuggestions(root, prefix);

        for (List<String> list : ans) {
            for (String word : list) {
                System.out.print(word + ", ");
            }
            System.out.println();
        }
    }
}
