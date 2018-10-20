package Task1.Abstract;


public class Test{
    public static void main(String []args){
        Cylinder cyl = new Cylinder(6,7);
        Sphere sph = new Sphere(10);
        Cube c = new Cube(7);
        System.out.println(cyl.volume() + " " +  cyl.surfaceArea());
        System.out.println(sph.volume() + " " + sph.surfaceArea());
        System.out.println(c.volume() + " " + c.surfaceArea());
    }
}
