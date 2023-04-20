

class Cylinder {
    float radius;
    float height;
    double pi= Math.PI;
    public void setpar(float rad,float hei){
        radius=rad;
        height=hei;
    }
    public float getRadius(){
        return radius;
    }
    public float getHeight(){
        return height;
    }

    public double Volume(){
        return 2*pi*radius*radius*height;
    }
    public double SurfaceArea(){
        return 2*pi*radius*height+2*pi*radius*radius;
    }


}
public class CWH_44_ps_09 {
    public static void main(String[] args) {
        Cylinder cy=new Cylinder();
        cy.setpar(7,14);
        System.out.println(cy.getHeight());
        System.out.println(cy.getRadius());
        System.out.println(cy.SurfaceArea());
        System.out.println(cy.Volume());

    }
}
