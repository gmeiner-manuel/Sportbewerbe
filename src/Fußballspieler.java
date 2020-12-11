public class Fußballspieler extends Sportler {

    private double transferBetrag;

    public Fußballspieler(int id, String vorname, String nachname, String nat, double transferBetrag) {
        super(id, vorname, nachname, nat);
        setTransferBetrag(transferBetrag);
    }

    public double getTransferBetrag() {
        return transferBetrag;
    }

    public void setTransferBetrag(double transferBetrag) {
        this.transferBetrag = transferBetrag;
    }

    @Override
    public String toString() {
        return "Fußballspieler{" +
                "transferBetrag=" + transferBetrag +
                '}';
    }
}
