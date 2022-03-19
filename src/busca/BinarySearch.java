package busca;

public class BinarySearch {

    public int[] orderedArrayItens;

    public BinarySearch() {
        orderedArrayItens = new int[100];
        for (int i = 0; i < orderedArrayItens.length; i++) {
            orderedArrayItens[i] = 2*i + 1;
        }

        this.orderedArrayItens = orderedArrayItens;
    }

    public BinarySearch(int[] orderedArrayItens) {
        this.orderedArrayItens = orderedArrayItens;
    }

    public Integer searchArray(int number) {
        int up = orderedArrayItens.length - 1;
        int down = 0;

        while(down <= up) {
            int middle = (up + down)/2;
            int attempt = orderedArrayItens[middle];

            if(attempt == number) {
                return middle;
            } else if(attempt < number) {
                down = middle + 1;
            } else if(attempt > number) {
                up = middle - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arrayItens = {10, 15, 20, 25, 30, 35, 40, 45, 50, 55};
        var binarySearch = new BinarySearch(arrayItens);
        System.out.println(String.valueOf(binarySearch.searchArray(15)));
    }

}
