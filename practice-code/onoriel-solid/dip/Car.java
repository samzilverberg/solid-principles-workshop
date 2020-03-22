package solid.dip;

/**
 * What if we want to swap out the engine and steering wheel?
 * 
 * What If we want a Car with a Super Fast Engine and Super Deluxe Steering Wheel??
 *
 */
class Car
{
    private BasicEngine _engine;
    private BasicSteeringWheel _steeringWheel;
    
    public Car ()
    {
        _engine = new BasicEngine();
        _steeringWheel= new BasicSteeringWheel();
    }
}

class BasicEngine{}
class BasicSteeringWheel{}