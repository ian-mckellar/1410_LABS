package labWrapperClassGui;

public class DemoWrapperClassConsole {
    public static void main(String[] args)
    {
        DemoWrapperClass dwc = new DemoWrapperClass();

        System.out.println("Method minMax:\n");
        System.out.print(dwc.minMax());

        System.out.println("\nMethod toBinary:\n");
        System.out.print(dwc.toBinary(15));

        System.out.println("\nMethod charProperties:\n");
        System.out.print(dwc.charProperties(' '));
        System.out.print(dwc.charProperties('1'));
        System.out.print(dwc.charProperties('B'));
        System.out.print(dwc.charProperties('b'));

    }

}
