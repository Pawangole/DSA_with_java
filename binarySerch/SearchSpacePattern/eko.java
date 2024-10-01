package binarySerch.SearchSpacePattern;

import java.util.*;
import java.lang.*;

class Eko {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Eko sol = new Eko();
        int ans = sol.solution(arr, N, M);
        System.out.print(ans);
    }

    public int solution(int arr[], int N, int M) {
        int start = 0;
        int end = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            end = Math.max(end, arr[i]);
        }

        int ans = -1;

        while (start <= end) { // corrected the condition to include end
            int mid = start + (end - start) / 2;

            if (isPossible(arr, N, M, mid)) { // added missing bracket and fixed method name
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    boolean isPossible(int arr[], int N, int M, int height) { // fixed method signature and argument name
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] > height) {
                sum += arr[i] - height;
            }
            if (sum >= M) {
                return true;
            }
        }
        return false;
    }
}
