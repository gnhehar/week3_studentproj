package studentdetails;

public class StudentDetails {
        
        public static void main(String[] args){

        
        Student[] studentlist=new Student[3];
        
        Student s1 = new Student();
        s1.setAge(19);
        s1.setName("Lilli");
        
        Student s2 = new Student();
        s2.setName("Harman");
        s2.setAge(19);
        
        Student s3 = new Student();
        s3.setAge(20);
        s3.setName("bleh");
        
        studentlist[0]=s1;
        studentlist[1]=s2;
        studentlist[2]=s3;
        
        for(int i = 0; i<studentlist.length;i++){
        System.out.println(studentlist[i].getName()+" "+studentlist[i].getAge());
                System.out.println("epsum lorem");
                SYstem.out.println("tu vas un chien");
            }
        }
   
            
}
