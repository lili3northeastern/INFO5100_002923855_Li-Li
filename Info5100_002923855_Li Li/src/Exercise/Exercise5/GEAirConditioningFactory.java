package Exercise.Exercise5;

public class GEAirConditioningFactory implements airConditioningFactory{

    public airConditioning produce() {
        System.out.println("LG made LG air conditioning");
        return new GEAirConditioning();
    }

}
