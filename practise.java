public class practise {

    // public static void Selectionsort(int arr[]){
    //     for (int i = 0; i <arr.length-1; i++) {
    //         int smallest=i;
    //         for (int j = i+1; j <arr.length ; j++) {
    //             if (arr[smallest]>arr[j]){
    //                 smallest=j;
    //             }
                
    //         }
    //         int temp=arr[smallest];
    //         arr[smallest]=arr[i];
    //         arr[i]= temp; 

            
    //     }
    // }
    public abstract class Shape {
        void area(){
            System.out.println("this is area of abstract class");
        }

    }
    public class Triangle extends Shape{
        double length,breadth;
        public Triangle(double length,double breadth){
            this.length=length;
            this.breadth=breadth;
        }
        void area(){
            double area=(1/2)*length*breadth;
            System.out.println("area of triangle is :"+area);
        }
    }
    public class Rectangle extends Shape{
        double length,breadth;
        public Rectangle(double length,double breadth){
            this.length=length;
            this.breadth=breadth;
        }
        void area(){
            double area=length*breadth;
            System.out.println("area of Rectangle is :"+area);
        }
    }
    public class Circle extends Shape{
        double radius ;
        public Circle(double radius){
            this.radius=radius;
           
        }
        void area(){
            double area=(3.14)*radius*radius;
            System.out.println("area of circle is :"+area);
        }
    }

    public static void main(String[] args) {
    //     int arr[]={5,4,1,2,3};
    //     Selectionsort(arr);
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i]+" ");
            
    //     }
    //     System.out.println(" ");

        // for(int i=1;i<=5;i++){
        //     int s=1;
        //     for(int j=1;j<=5;j++){
        //         System.out.print(s);
        //         s++;
               


        //     }System.out.println("");  
        // }
        practise practise = new practise();
        Shape triangle= practise.new Triangle(10,5);
        triangle.area();
        Shape rect= practise.new Rectangle(10,20);
        rect.area();
        Shape circle =practise.new Circle(10);
        circle.area();
    }
    
}
