public class Etudiant {
    private String etudiantNom;

    public Etudiant(String name){
        //这个构造器仅有一个参数：name
        System.out.println("小狗的名字是 : " + name );
    }

    public static void main(String argv[]){
        Etudiant e = new Etudiant("kobe");//如果注释掉上方的构造器，此处kobe会报错
        e.setNom("Wade");
        System.out.println("Nom:" + e.getNom());

    }

    public void setNom(String nom) {
        etudiantNom = nom;
    }

    private String getNom() {
        System.out.println("小狗的名字是 : " + etudiantNom );
        return etudiantNom;
    }
}
