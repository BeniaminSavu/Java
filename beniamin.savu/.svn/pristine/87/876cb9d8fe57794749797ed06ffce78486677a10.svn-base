package com.iquest.week6.pr2.factory;

import com.iquest.week6.pr2.domain.EngineArchitecture;
import com.iquest.week6.pr2.domain.Employee;
import com.iquest.week6.pr2.domain.Engine;
import com.iquest.week6.pr2.exception.UnqualifiedEmployeeException;
import com.iquest.week6.pr2.service.EmployeeService;
import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

public class FactoryTest {

	@Test
	public void testManufactureEngines(){
		Employee employee = new Employee("Michael Womack");
		EmployeeService employeeService = EasyMock.createNiceMock(EmployeeService.class);
		EasyMock.expect(employeeService.isAssemblyLineWorker(employee)).andReturn(true);
		EasyMock.replay(employeeService);
		
		EngineFactory engineFactory = new EngineFactory(employeeService);
		List<Engine> actualEngines = new ArrayList<Engine>();
		List<Engine> expectedEngines = new ArrayList<Engine>();
		
		actualEngines = engineFactory.manufactureEngines(1, employee);
		
		expectedEngines.add(new Engine(EngineArchitecture.L4, 2.0, 210));
		
		assertThat(actualEngines.get(0).getEngineArchitecture(), is(expectedEngines.get(0).getEngineArchitecture()));
	}
	
	@Test(expected = UnqualifiedEmployeeException.class)
    public void testEngineFactoryWithAnEmployeeThatIsNotAnAssemblyLineWorker(){
		Employee employee = new Employee("Michael Womack");
		EmployeeService employeeService = EasyMock.createNiceMock(EmployeeService.class);
		EasyMock.expect(employeeService.isAssemblyLineWorker(employee)).andReturn(false);
		EasyMock.replay(employeeService);
		
		EngineFactory engineFactory = new EngineFactory(employeeService);

		engineFactory.manufactureEngines(1, employee);
    }
}