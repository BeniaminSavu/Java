package com.iquest.week6.pr1.factory;

import com.iquest.week6.pr1.domain.Employee;
import com.iquest.week6.pr1.domain.Engine;
import com.iquest.week6.pr1.domain.EngineArchitecture;
import com.iquest.week6.pr1.domain.EngineComponent;
import com.iquest.week6.pr1.exception.InsufficientStockException;
import com.iquest.week6.pr1.exception.UnauthorizedEmployeeException;
import com.iquest.week6.pr1.exception.UnqualifiedEmployeeException;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FactoryTest {
	
	private EngineFactory engineFactory;
	private List<Employee> employees = new ArrayList<Employee>();
	private List<EngineComponent> engineComponents = new ArrayList<EngineComponent>();
	
	
    @Before
    public void setUp() {
       employees.add(new Employee("Allen Parker", true, true));
       employees.add(new Employee("Burke George", true, false));
       employees.add(new Employee("Herman Harley", false, true));
       employees.add(new Employee("Fletcher Jacobs", false, false));
       
       engineComponents.add(new EngineComponent("Turbocharged DOHC", 300));
       engineComponents.add(new EngineComponent("OHV", 500));
       engineComponents.add(new EngineComponent("Supercharged H-4", 400));
       
       engineFactory = new EngineFactory(employees, engineComponents);
    }	
	
    @Test
	public void testEngineFactory(){
		List<Engine> actualEngines = new ArrayList<Engine>();
		List<Engine> expectedEngines = new ArrayList<Engine>();
		
		actualEngines = engineFactory.manufactureEngines(1, employees.get(0));
		
		expectedEngines.add(new Engine(EngineArchitecture.L4, 2.0, 210));
		
		assertThat(actualEngines.get(0).getEngineArchitecture(), is(expectedEngines.get(0).getEngineArchitecture()));
	}
    
    @Test(expected = UnauthorizedEmployeeException.class)
    public void testEngineFactoryWithAnUnemployedWorker(){
    	engineFactory.manufactureEngines(1, new Employee("Savu Beniamin", true, true));
    }
    
    @Test(expected = UnqualifiedEmployeeException.class)
    public void testEngineFactoryWithAnEmployeeThatIsNotAnAssemblyLineWorker(){
    	engineFactory.manufactureEngines(1, employees.get(3));
    }
    
    @Test(expected = InsufficientStockException.class)
    public void testEngineFactoryWithNotEnoughComponents(){
    	engineFactory.manufactureEngines(2, employees.get(0));
    }
    
    @Test(expected = InsufficientStockException.class)
    public void testEngineFactoryWithNullEngineComponents(){
    	engineFactory = new EngineFactory(employees, null);
    	engineFactory.manufactureEngines(2, employees.get(0));
    }
    
    
    
    
}