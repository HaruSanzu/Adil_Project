package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.RepoA;

@Service("myCustomBean")
public class ServiceA {
    private RepoA repoA;


    @Autowired

    private String attribute = "default";

    public ServiceA(RepoA repoA) {
        this.repoA = repoA;
    }

    public void methodServiceA(){
        System.out.println("Attribute" + attribute + "Class ServiceA method called");
        repoA.getMethodRepoA();
    }
}
