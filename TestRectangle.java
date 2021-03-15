package inclass;
class ex1{
	private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public ex1(int width, int height) {
        if (width < 0) {
            System.out.println("Error input width, width = 1");
            width = 1;
        }
        this.width = width;
        if (height < 0) {
            System.out.println("Error input height, height = 1");
            height = 1;
        }
        this.height = height;
    }

    public void visualize() {
        System.out.println(this);
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}
public class TestRectangle {

    public static void main(String[] args) {
    	ex1 r1 = new ex1(2, 2);
        r1.visualize();
        ex1 r2 = new ex1(5, 6);
        r2.visualize();
        ex1 r3 = new ex1(-5, 6);
        r3.visualize();
        ex1 r4 = new ex1(6, -5);
        r4.visualize();
        ex1 r5 = new ex1(-2, -2);
        r5.visualize();

    }
}
