public class Beer {


    public Integer mengeImGlas;
    public Beer(){
        this.mengeImGlas = 250;
    }

    public void neuesBier(){
        this.mengeImGlas = 250;

    }

    public void trinken(Integer wieViel ){
            this.mengeImGlas -= wieViel;
    }

    public void nachFuellen(Integer wieViel){
        this.mengeImGlas += wieViel;
        this.mengeImGlas = (this.mengeImGlas>250)? 250 : this.mengeImGlas ;
    }


}
