package org.javaacademy.core.homework.homework2.office;

public class Secretary {
    String post;

    public Secretary(String post) {
        this.post = post;
    }

    public String getPost() {
        return post;
    }

    public void dontWorry(Secretary secretary, Boss boss, Manager manager, Security security) {
        System.out.println(secretary.getPost() + ": \"" + boss.getName() + ", не волнуйтесь, " + manager.getName() + " все успеет. "
                + security.getName() + " - подождите!\"");
    }
}
