class Main {

    public static void main(String[] args) {
        Subject clapton = new Subject("Eric Clapton");
        Subject freddy = new Subject("Freddy Mercury");

        observer agustin = new observer("Agustin Alfonso");
        observer horacio = new observer("Horacio Fuentes");
        observer maru = new observer("Marina Donis");


        clapton.attach(agustin);
        clapton.attach(horacio);
        clapton.attach(maru);

        freddy.attach(agustin);
        freddy.attach(maru);

        clapton.tweet("I am god");
        freddy.tweet("I can't tweet");

    }
}
