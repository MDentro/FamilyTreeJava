import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
    private String mother;
    private String father;
    private ArrayList<String> siblings = new ArrayList<>();
    private ArrayList<String> children = new ArrayList<>();
    private ArrayList<String> grandChildren = new ArrayList<>();
    private ArrayList<String> pets = new ArrayList<>();

    public Person(String name, String lastName, String sex, int age) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Person(String name, String middleName, String lastName, String sex, int age) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public ArrayList<String> getSiblings() {
        return siblings;
    }

    public void setSiblings(ArrayList<String> siblings) {
        this.siblings = siblings;
    }

    public ArrayList<String> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<String> children) {
        this.children = children;
    }

    public void setGrandChildren(List<String> grandChildren) {
        for (int i = 0; i < grandChildren.size(); i++) {
            grandChildren.add(grandChildren.get(i));
        }
    }

    public ArrayList<String> getPets() {
        return pets;
    }

    public void setPets(ArrayList<String> pets) {
        this.pets = pets;
    }

    public void addParents(String woman, String man) {
        setMother(woman);
        setFather(man);
    }

    public void addChildren(String child) {
        children.add(child);
    }

    public void addSibling(String sibling) {
        siblings.add(sibling);
    }


    public void addGrandChildren(String grandChild) {
        grandChildren.add(grandChild);
    }

    public String getGrandChildren() {
        String allGrandChildren = "";
        for (int i = 0; i < this.grandChildren.size(); i++) {
            allGrandChildren = allGrandChildren + grandChildren.get(i) + " ";

        }
        return allGrandChildren;
    }
}
