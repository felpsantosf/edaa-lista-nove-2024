

public class Bebida {
    private String _pais;
    private int _numCervejasServidas;
    private int _numBebidasEspituaisServidas;
    private int _numVinhosServidos;
    private float _totalDeLitrosDeAlcoolPuroServidos;

    public Bebida(String pais, int numCervejasServidas, int numBebidasEspituaisServidas, int numVinhosServidos, float totalDeLitrosDeAlcoolPuroServidos){
       this._pais = pais;
       this._numVinhosServidos = numVinhosServidos;
       this._numBebidasEspituaisServidas = numBebidasEspituaisServidas;
       this._numCervejasServidas = numCervejasServidas;
       this._totalDeLitrosDeAlcoolPuroServidos = totalDeLitrosDeAlcoolPuroServidos;
    }

    public float get_totalDeLitrosDeAlcoolPuroServidos() {
        return _totalDeLitrosDeAlcoolPuroServidos;
    }

    public void set_totalDeLitrosDeAlcoolPuroServidos(float _totalDeLitrosDeAlcoolPuroServidos) {
        this._totalDeLitrosDeAlcoolPuroServidos = _totalDeLitrosDeAlcoolPuroServidos;
    }

    public int get_numVinhosServidos() {
        return _numVinhosServidos;
    }

    public void set_numVinhosServidos(int _numVinhosServidos) {
        this._numVinhosServidos = _numVinhosServidos;
    }

    public int get_numBebidasEspituaisServidas() {
        return _numBebidasEspituaisServidas;
    }

    public void set_numBebidasEspituaisServidas(int _numBebidasEspituaisServidas) {
        this._numBebidasEspituaisServidas = _numBebidasEspituaisServidas;
    }

    public int get_numCervejasServidas() {
        return _numCervejasServidas;
    }

    public void set_numCervejasServidas(int _numCervejasServidas) {
        this._numCervejasServidas = _numCervejasServidas;
    }

    public String get_pais() {
        return _pais;
    }

    public void set_pais(String _pais) {
        this._pais = _pais;
    }


    @Override
    public String toString(){
        return "País que mais consome vinho: " + this._pais + "\nQuantidade: " + this.get_numVinhosServidos();
    }
}