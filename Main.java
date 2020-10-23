class Main {
  public static void main(String[] args) {
    System.out.println("Hellooo!");
    for (int i=0; i<200;i++){
    if  ((i%5 == 0)&&(i!=0)){
      System.out.println("zahl durch 5 teilbar: "+i);
    }
    if ((i-9)%10==0){
      System.out.println("Zahl endet auf 9: "+i);
    }
    if ((i-1+i)%3==0){
System.out.println("Zahl mit vorgänger % 3: "+i);
    }    }
  }
}