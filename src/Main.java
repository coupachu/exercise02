// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int lowTemp = 32;
        String days[] = {"sunday", "monday","tuesday","wednesday","thursday","friday","saturday"};
        int dailyHighs[] = {45, 29, 10, 22, 41, 28, 33};
        int precip[] = {95, 60, 25, 5, 0, 75, 90};

        for(int i = 0; i < dailyHighs.length; i++) {
            if(dailyHighs[i]<=lowTemp) {
                if (precip[i] >= 50) {
                    System.out.print("it will snow on " + days[i]);
                } else {
                    System.out.print("it will be cold but won't snow on " + days[i]);
                }
            }
            else if(dailyHighs[i]>lowTemp){
                if (precip[i] >= 50) {
                    System.out.print("it will be warmer and rain on " + days[i]);
                } else {
                    System.out.print("it will be warmer and wont rain on " + days[i]);
                }
            }
            System.out.println(" | " + dailyHighs[i] + " degrees | " + precip[i] + "% chance of precipitation");
        }
        }
    }