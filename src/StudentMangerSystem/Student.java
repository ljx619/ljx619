package StudentMangerSystem;

public class  Student {
    private String name;
    private String  java;
    private String  python;
    private String  sum;

    public Student() {
    }

    public Student(String name, String java, String python, String sum) {
        this.name = name;
        this.java = java;
        this.python = python;
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJava() {
        return java;
    }

    public void setJava(String java) {
        this.java = java;
    }

    public String getPython() {
        return python;
    }

    public void setPython(String python) {
        this.python = python;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }
}
