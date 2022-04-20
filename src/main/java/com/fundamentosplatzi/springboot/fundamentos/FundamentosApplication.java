package com.fundamentosplatzi.springboot.fundamentos;

import com.fundamentosplatzi.springboot.fundamentos.bean.MyBean;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyBeanWithDependency;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

private MyBean myBean;
private MyBeanWithDependency myBeanWithDependency;

    public FundamentosApplication(MyBean myBean, MyBeanWithDependency myBeanWithDependency){
        this.myBean = myBean;
        this.myBeanWithDependency = myBeanWithDependency;
    }

    public static void main(String[] args) {
        SpringApplication.run(FundamentosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        myBean.print();
        myBeanWithDependency.printWithDependency();
    }
}
