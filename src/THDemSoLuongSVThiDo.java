

public class THDemSoLuongSVThiDo {
    public static void main(String[] args) {
        int[] array = new int[30];
        int count = 0;
        System.out.println();
        System.out.println("List of mark : ");
        for (int i=0;i<array.length;i++){
            array[i]= (int) (Math.random()*10);
            System.out.print(array[i]+"\t");
            if (array[i]>=5&&array[i]<=10){
                count++;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("The number of students passing the exam is "+count);


    }
}
