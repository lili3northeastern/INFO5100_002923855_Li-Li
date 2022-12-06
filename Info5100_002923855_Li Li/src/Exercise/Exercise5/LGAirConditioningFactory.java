package Exercise.Exercise5;


public class LGAirConditioningFactory implements airConditioningFactory{
    public airConditioning produce() {
        System.out.println("LG made LG Air Conditioning");
        return new LGAirConditioning();
    }
}
