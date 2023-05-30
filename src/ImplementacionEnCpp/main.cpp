#include <iostream>

using namespace std;

// Interfaz para los diferentes tipos de medios
class Medio {
public:
  virtual void reproducir() = 0;
  virtual void detener() = 0;
  virtual ~Medio() {} // Destructor virtual
};

// Interfaz para los diferentes tipos de dispositivos
class Dispositivo {
public:
  virtual void conectar() = 0;
  virtual void desconectar() = 0;
  virtual void reproducirMedio(Medio *medio) = 0;
  virtual void detenerReproduccion() = 0;
  virtual ~Dispositivo() {} // Destructor virtual
};

// Implementación concreta de Medio: Música
class Musica : public Medio {
private:
  string titulo;
  string artista;

public:
  Musica(const string &titulo, const string &artista)
      : titulo(titulo), artista(artista) {}

  void reproducir() override {
    cout << "Reproduciendo música: " << titulo << " - " << artista << endl;
  }

  void detener() override { cout << "Deteniendo música" << endl; }

  ~Musica() {} // Destructor virtual
};

// Implementación concreta de Medio: Película
class Pelicula : public Medio {
private:
  string titulo;
  string director;

public:
  Pelicula(const string &titulo, const string &director)
      : titulo(titulo), director(director) {}

  void reproducir() override {
    cout << "Reproduciendo película: " << titulo << " - " << director << endl;
  }

  void detener() override { cout << "Deteniendo película" << endl; }

  ~Pelicula() {} // Destructor virtual
};

// Implementación concreta de Dispositivo: Televisor
class Televisor : public Dispositivo {
public:
  void conectar() override { cout << "Conectando televisor" << endl; }

  void desconectar() override { cout << "Desconectando televisor" << endl; }

  void reproducirMedio(Medio *medio) override {
    cout << "Reproduciendo medio en el televisor" << endl;
    medio->reproducir();
  }

  void detenerReproduccion() override {
    cout << "Deteniendo reproducción en el televisor" << endl;
  }

  ~Televisor() {} // Destructor virtual
};

// Implementación concreta de Dispositivo: Altavoz
class Altavoz : public Dispositivo {
public:
  void conectar() override { cout << "Conectando altavoz" << endl; }

  void desconectar() override { cout << "Desconectando altavoz" << endl; }

  void reproducirMedio(Medio *medio) override {
    cout << "Reproduciendo medio en el altavoz" << endl;
    medio->reproducir();
  }

  void detenerReproduccion() override {
    cout << "Deteniendo reproducción en el altavoz" << endl;
  }

  ~Altavoz() {} // Destructor virtual
};

int main() {
  // Crear los medios
  Medio *musica = new Musica("Canción de ejemplo", "Artista de ejemplo");
  Medio *pelicula = new Pelicula("Película de ejemplo", "Director de ejemplo");

  // Crear los dispositivos
  Dispositivo *televisor = new Televisor();
  Dispositivo *altavoz = new Altavoz();

  // Reproducir medios en los dispositivos
  televisor->conectar();
  televisor->reproducirMedio(musica);
  televisor->detenerReproduccion();
  televisor->reproducirMedio(pelicula);
  televisor->desconectar();

  altavoz->conectar();
  altavoz->reproducirMedio(musica);
  altavoz->detenerReproduccion();
  altavoz->reproducirMedio(pelicula);
  altavoz->desconectar();

  delete musica;
  delete pelicula;
  delete televisor;
  delete altavoz;

  return 0;
}