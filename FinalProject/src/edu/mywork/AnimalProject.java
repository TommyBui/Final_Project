package edu.mywork;

import java.util.*;
import edu.mywork.animals.*;
import edu.mywork.demos.IDemo;
import edu.mywork.demos.console.*;

public class AnimalProject 
{
	public static void main(String[] args)
    {
        List<IAnimal> animals = AnimalFactory.GetAnimals(2);
        IDemo demo = null;
        
        demo = new TalkDemo();
        demo.show(animals);
        
        demo = new Space2DWalkDemo();
        demo.show(animals);
        
        demo = new Space2DRunDemo();
        demo.show(animals);
        
    }
    
}
