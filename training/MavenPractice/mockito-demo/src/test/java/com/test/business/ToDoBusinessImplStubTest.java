package com.test.business;

import com.test.data.api.ServiceToDo;
import com.test.data.api.ServiceTodDoStub;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class ToDoBusinessImplStubTest {

    @Test
    public void testretrieveTodosRelatedToSpring_usingaStub() {

        ServiceToDo todoService=new ServiceTodDoStub();
        BusinessImplClass businessimpl=new BusinessImplClass(todoService);
        List<String> filteredTodos=businessimpl.retrieveTodosRelatedToSpring("is");
        assertEquals(2,filteredTodos.size() );
    }
}
