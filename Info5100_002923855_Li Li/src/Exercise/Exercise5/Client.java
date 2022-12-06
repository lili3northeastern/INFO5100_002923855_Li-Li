package Exercise.Exercise5;

import Exercise.Exercise5.XMLUtil;

public class Client {
    public static void main(String[] args) {
        try {
            airConditioning AC;
            airConditioningFactory factory;
            factory = (airConditioningFactory) XMLUtil.getBean();
            AC = factory.produce();
            AC.display();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
