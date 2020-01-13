package arrayofobject;

public class print {
    
    public static void main(String[] args){
        
        Student[] list= new Student[3];
        
        Student s1= new Student();
        s1.setName("zeh");
        s1.setSid(0210);
        
        Student s2= new Student();
        s2.setName("lucao");
        s2.setSid(1234);
        
        Student s3= new Student();
        s3.setName("baioni");
        s3.setSid(6699);
        
        list[0]= s1;
        list[1]= s2;
        list[2]= s3;
        
        for (int i=0; i<list.length; i++){
            
            System.out.println(list[i].getName()+" "+list[i].getSid());
            
    }
    }
}
