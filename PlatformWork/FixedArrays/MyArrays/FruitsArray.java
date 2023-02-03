class FruitsArray {
    public static void main(String[] args){
    String[] heros = {"batman", "superman", "captain america", "black panther"};
    String temp = heros[3];
    heros[3] = heros[0];
    heros[0] = temp;

    System.out.println(heros.length);
    System.out.println(heros[heros.length - 1]);



    }
}

