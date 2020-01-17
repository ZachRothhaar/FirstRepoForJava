public class MultiplicationChartClass implements MultiplicationChartInterface{
    private int input;
    public MultiplicationChartClass(int num) {
        input = num;
    }

    @Override
    public void displayChart() {
        System.out.print("X|");
        for(int k =1; k < input+1; k++ )
        {
            System.out.format("%4d", k);

        }

        System.out.print("\n" +"-|");
        for(int g =0; g< input; g++)
        {
            System.out.print("----");
        }

        for(int i =0; i < input; i++)
        {
           System.out.print("\n"+ (i+1) + "|");

            for(int j=0; j < input; j++)
            {
                System.out.format("%4d", (i+1) * (j+1));
            }


        }
    }


}
