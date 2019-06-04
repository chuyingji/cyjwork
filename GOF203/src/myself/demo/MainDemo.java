package myself.demo;

public class MainDemo {
	public static void main(String[] args) {
		Student a = new Student(0);
        Student b = new Student(100);

        System.out.println("交换前：");
        System.out.println("a的分数：" + a.getScore() + "--- b的分数：" + b.getScore());

        swap(a, b);

        System.out.println("交换后：");
        System.out.println("a的分数：" + a.getScore() + "--- b的分数：" + b.getScore());
    }

    public static void swap(Student x, Student y) {
        Student temp = x;
        x = y;
        y = temp;
    }
	
	
	
}
class Student {
	String name = "sss";
	
    private float score;

    public Student(float score) {
        this.score = score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public float getScore() {
        return score;
    }
}