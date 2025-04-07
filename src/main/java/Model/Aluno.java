package Model;

public class Aluno {
    
    private String name;
    private Double[] notas = new Double[3];
    
    public Aluno(){
    }

    public Aluno(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double[] getNotas() {
        return notas;
    }

    public void setNotas(int index, Double nota) {
       if(index >= 0 && index < notas.length){
           this.notas[index] = nota;
       }
       else{
           System.out.println("Index invalido");
       }
    }
    
    public Double getMedia(){
        double sum = 0;
        for(Double nota : notas){
            sum += nota;
        }
        return sum/notas.length;
    }

    @Override
    public String toString() {
        return "Aluno{" + "name=" + name + ", notas=" + notas + '}';
    }
    
    
    
}
