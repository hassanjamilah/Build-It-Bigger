package com.udacity.gradle.builditbigger;




import android.content.Context;

import android.test.AndroidTestCase;
import android.util.Log;
import android.util.Pair;




import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;

public class TestNotNull extends AndroidTestCase {

    final CountDownLatch signal = new CountDownLatch(1) ;





    public void testNotNull(){

        EndpointsAsyncTask task   = new EndpointsAsyncTask() ;
        task.execute(getContext()) ;
        String result = "" ;
        try {
            result = task.get()   ;


        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        assertNotNull(result);

    }

}
