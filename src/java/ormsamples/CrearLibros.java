/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ormsamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import modelo.Libro;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

/**
 *
 * @author Manuel
 */
public class CrearLibros {
    
    /**
     *
     * @return
     */
    public static String[] librosNombres(){
        String lista = "1984\n" +
"Al faro\n" +
"Almas muertas\n" +
"Ana Karenina\n" +
"Beloved\n" +
"Berlin Alexanderplatz\n" +
"Bostan\n" +
"Casa de muñecas\n" +
"Cien años de soledad\n" +
"Crimen y castigo\n" +
"Cuentos\n" +
"Cuentos infantiles\n" +
"Cumbres Borrascosas\n" +
"Decamerón\n" +
"Diario de un loco\n" +
"Divina Comedia\n" +
"Don Quijote de la Mancha\n" +
"Edipo rey\n" +
"El amor en los tiempos del cólera\n" +
"El castillo\n" +
"El cuaderno dorado\n" +
"El extranjero\n" +
"El hombre invisible\n" +
"El hombre sin atributos\n" +
"El idiota\n" +
"El proceso\n" +
"El rey Lear\n" +
"El ruido y la furia\n" +
"El sonido de la montaña\n" +
"El tambor de hojalata\n" +
"El viejo y el mar\n" +
"En busca del tiempo perdido\n" +
"Eneida\n" +
"Ensayo sobre la ceguera\n" +
"Ensayos\n" +
"Fausto\n" +
"Ficciones\n" +
"Gargantúa y Pantagruel\n" +
"Genji Monogatari\n" +
"Gente independiente\n" +
"Gran Sertón: Veredas\n" +
"Grandes Esperanzas\n" +
"Guerra y paz\n" +
"Hambre\n" +
"Hamlet\n" +
"Hijos de la medianoche\n" +
"Hijos de nuestro barrio\n" +
"Hijos y amantes\n" +
"Hojas de hierba\n" +
"Ilíada\n" +
"Jacques el fatalista\n" +
"La conciencia de Zeno\n" +
"La educación sentimental\n" +
"La historia\n" +
"La montaña mágica\n" +
"La muerte de Iván Ilich\n" +
"La señora Dalloway\n" +
"Las aventuras de Huckleberry Finn\n" +
"Las metamorfosis\n" +
"Las mil y una noches\n" +
"Libro de Job (de la Biblia)\n" +
"Libro del desasosiego\n" +
"Lolita\n" +
"Los Buddenbrook\n" +
"Los cuentos de Canterbury\n" +
"Los endemoniados\n" +
"Los hermanos Karamazov\n" +
"Los viajes de Gulliver\n" +
"Madame Bovary\n" +
"Mahabhárata\n" +
"Masnavi\n" +
"Medea\n" +
"Memorias de Adriano\n" +
"Middlemarch\n" +
"Moby-Dick\n" +
"Molloy, Malone muere, El Innombrable, una trilogía\n" +
"Nostromo\n" +
"Odisea\n" +
"Orgullo y prejuicio\n" +
"Otelo\n" +
"Papá Goriot\n" +
"Pedro Páramo\n" +
"Pippi Calzaslargas\n" +
"Poema de Gilgamesh\n" +
"Poemas\n" +
"Ramayana\n" +
"Relatos cortos\n" +
"Rojo y negro\n" +
"Romancero gitano\n" +
"Saga de Njál\n" +
"Shakuntala\n" +
"Tiempo de migrar al norte\n" +
"Todo se desmorona\n" +
"Ulises\n" +
"Viaje al fin de la noche\n" +
"Vida y opiniones del caballero Tristram Shandy\n" +
"Zorba, el griego\n" +
"¡Absalom, Absalom!\n" +
"El Anticristo\n" +
"El árbol de Navidad\n" +
"El arca y el aparecido\n" +
"El calvario de una mujer (tomo II)\n" +
"El camaleón\n" +
"El camino de Francia - Tomo I\n" +
"El camino de Francia - Tomo II\n" +
"El camino interior del arte\n" +
"El Candelero\n" +
"El capitán Pérez\n" +
"El capocómico que admiraba a Olmedo\n" +
"El capote\n" +
"El carasino idealista\n" +
"El carbunclo azul\n" +
"El casamiento\n" +
"El casamiento de Laucha\n" +
"El casamiento engañoso\n" +
"El caso de la señorita Amelia\n" +
"El caso del portillo de Coulter\n" +
"El caso Peralta y otros cuentos\n" +
"El Castillo de los Cárpatos\n" +
"El castillo de Otranto\n" +
"El castillo durmiente\n" +
"El celoso extremeño\n" +
"El chiflón del diablo\n" +
"El chitón de las Tarabillas\n" +
"El Chucro\n" +
"El cine mexicano: la otra escuela. Educación y valores en las películas mexicanas\n" +
"El cínico\n" +
"El cocinero del Arzobispo\n" +
"El Código Científico\n" +
"El colapso del modo de vida moderno / The collapse of modern way of life\n" +
"El coloquio de los perros\n" +
"El color del olvido\n" +
"El Conde de Montecristo (Tomo I)\n" +
"El Conde de Montecristo (Tomo II)\n" +
"El Conde de Montecristo (Tomo III)\n" +
"El Conde de Montecristo (Tomo IV)\n" +
"El Conde de Montecristo (Tomo V)\n" +
"El Conde de Montecuyo\n" +
"El Conde Drácula no ha muerto\n" +
"El Conde Kostia\n" +
"El condenado por desconfiado\n" +
"El Contrato Social\n" +
"El convivio\n" +
"El Corazón Susurra, el Miedo Aúlla - el amor y el miedo desde la Psicología Mística\n" +
"El coronel Estompa\n" +
"El crimen de la guerra\n" +
"El crimen de una santa\n" +
"El cristiano\n" +
"El cuento de la serpiente verde\n" +
"El cuento de un overo\n" +
"El cuento que mata\n" +
"El cuervo solicitante\n" +
"El cura de Tours\n" +
"El dedo pulgar del ingeniero\n" +
"Fausto\n" +
"Fecundidad de la memoria\n" +
"Fedra\n" +
"Fedra\n" +
"Felicidad\n" +
"Felicidades en tu día papá\n" +
"Feliz hogar\n" +
"Festín\n" +
"Film\n" +
"Filosofía Crítica Trascendental\n" +
"Filosofía del arte (tomo I)\n" +
"Filosofía del arte (tomo II)\n" +
"Floreal\n" +
"Flores de China\n" +
"Flores en el Cielo\n" +
"Fondos privados, fines públicos\n" +
"Forever Bicycle\n" +
"Geometría en el Plano\n" +
"Gerifalte\n" +
"Gerona\n" +
"Gestando sueños\n" +
"Gestión de calidad en la formación de académicos para la Educación Superior\n" +
"Gil Braltar\n" +
"Globalización, ¿la Nueva Torre de Babel?\n" +
"Gloriosa mar\n" +
"Golpe doble\n" +
"Gotas de Anzio\n" +
"Grafía Furtiva = Furtive Writings \n" +
"Grietas de luz\n" +
"Gripe o Hamor\n" +
"Guapeza valenciana\n" +
"Guárdate del agua mansa\n" +
"Guillermo Tell\n" +
"Guitarra\n" +
"Historia de dos ciudades\n" +
"Historia de la Biblia\n" +
"Historia de la decadencia y ruina del Imperio Romano\n" +
"Historia de la Filosofía\n" +
"Historia de mi vida\n" +
"Historia de un peso falso\n" +
"Historia de una capinera\n" +
"Historia de una corista (carta atrasada)\n" +
"Historia de una nueva traición\n" +
"Historia de una parisiense\n" +
"Historia de una pasión argentina\n" +
"Historia de una rosa de papel\n" +
"Historia de una vida - Primera parte (1942-1975)\n" +
"Historia del Imperio Ruso bajo Pedro el Grande\n" +
"Historia del quinto hermano del barbero\n" +
"Historia del satanismo y la brujería\n" +
"Historia Universal bajo la República Romana (tomo I)\n" +
"Historia Universal bajo la República Romana (tomo II)\n" +
"Historia Universal bajo la República Romana (tomo III)\n" +
"Historias de animales y veterinarios (tomo VIII de \"Obra incompleta\")\n" +
"Historias de Pueblo Chico\n" +
"Historias del Bajo y otras evocaciones \n" +
"Historias dos veces contadas\n" +
"Historias escondidas\n" +
"Hoja de tilo naranja - Poemas indómitos\n" +
"Hojas caídas\n" +
"Hombrecitos\n" +
"Hombres de a pie\n" +
"Mansfield Park\n" +
"Mansiones Verdes\n" +
"Manual de Estética Precolombina\n" +
"Manual de Terapéutica Oncológica\n" +
"Manual Práctico de Telemarketing y E-mail\n" +
"Manual Teórico-Práctico - Periodismo y realización radiofónicos\n" +
"Manuel Belgrano - El verdadero Padre de la Patria\n" +
"Manuscrito hallado en una botella\n" +
"Maquiavelo y Sun Tzu - Herramientas y Consejos Tácticos\n" +
"Mar de Icaria\n" +
"Marcela\n" +
"Margarita Chauveley\n" +
"María\n" +
"Pesadilla drolática\n" +
"Peso pesado\n" +
"Pétalos y Espinas: Hombres Gay, Relaciones de Pareja y Violencia\n" +
"Picaresca porteña\n" +
"Pipatón - El cacique de los talones alados\n" +
"Piropos y trabalenguas\n" +
"Plan de Autoprotección en un Centro Educativo\n" +
"Planificación de la Enseñanza\n" +
"Platónov\n" +
"Por los antiguos surcos...\n" +
"Porque te quiero Fabiana\n" +
"Posicionamiento Unicista de Empresa, Marca y Producto\n" +
"Postales\n" +
"Práctica teatral - Lineamientos teóricos para su comprensión\n" +
"Prehistoria secreta\n" +
"Presentación de Tesis\n" +
"Primavera triste\n" +
"Primer amor\n" +
"Versos de amor\n" +
"Versos libres\n" +
"Viaje a la Luna\n" +
"Viaje a las cordilleras\n" +
"Viaje a través de la estirpe\n" +
"Viaje al Centro de la Tierra\n" +
"Viaje de retorno\n" +
"Viaje nocturno al séptimo cielo\n" +
"Viaje por el Paraguay\n" +
"Viajes con mi borrica a través de las cevenas\n" +
"Viajes suicidas\n" +
"Víctimas de delitos - Necesidad de otorgamiento de compensación o auxilio económico\n" +
"Victoria Accoramboni\n" +
"Vida Amor Risa";
        
        String libros[] = lista.split("\n");
        
        return libros;
        
    }
    
    /**
     *
     * @return
     */
    public static Date fechaEdicion(){
        
        int year = (int) (Math.random()*200+1800);
        int month = (int) (Math.random()*12)+1;
        int day = (int) (Math.random()*28)+1;
        
        Date fecha = new Date(""+year+"/"+month+"/"+day);
        
        
        return fecha;
    }
    
    /**
     *
     * @return
     */
    public static Date fechaAdquisicion(){
        
        int year = (int) (Math.random()*17+2000);
        int month = (int) (Math.random()*12)+1;
        int day = (int) (Math.random()*28)+1;
        
        Date fecha = new Date(""+year+"/"+month+"/"+day);
        
        
        return fecha;
    }

    /**
     *
     * @return
     * @throws PersistentException
     */
    public static ArrayList<modelo.Libro> generarLibros() throws PersistentException {

        ArrayList<modelo.Libro> lista = new ArrayList<>();
        
        String[] nomLibros = librosNombres();
        String[] coloresTapas = {"rojo","verde","negro","azul","naranjo","amarillo","blanco","gris"};
        String[] disponibilidad = {"Disponible", "No disponible","Disponible","Disponible"};
        String[] edicion = {"Primera", "Segunda","Tercera","Cuarta"};
        String[] editor = {"Booket", "Austral","Alienta","Deusto","Destino","Oniro","Luciernaga"};
        String[] deterioro = {"Bajo", "Mediano", "Alto"};
        String[] idioma = {"Español", "Español","Español","Español","Ingles","Ingles","Frances"};
        
        for (int i = 0; i < nomLibros.length; i++) {
            modelo.Libro libro = new modelo.Libro();
            
            
            
            int indice = (int) (Math.random()*8);
            
            libro.setColorTapa(coloresTapas[indice]);
            
            indice = (int) (Math.random()*4);
            
            libro.setDisponibilidad(disponibilidad[indice]);
            
            indice = (int) (Math.random()*4);
            
            libro.setEdicion(edicion[indice]);
            
            indice = (int) (Math.random()*7);
            
            libro.setEditor(editor[indice]);
            
            indice = (int) (Math.random()*3);
            
            libro.setEstadoDeterioro(deterioro[indice]);
            
            
            
            libro.setFechaDeEdicion(fechaEdicion());
            
            libro.setFechaDeAdquisicion(fechaAdquisicion());
            
            //libro.setFechaUltimaSolicitud(value);
            
            indice = (int) (Math.random()*12)+1;
            modelo.Categoria cat = modelo.CategoriaDAO.getCategoriaByORMID(indice);
            libro.setIdCategoria(cat);
            
            
            indice = (int) (Math.random()*12)+1;
            modelo.Estante est = modelo.EstanteDAO.getEstanteByORMID(indice);
            libro.setIdEstante(est);
            
            indice = (int) (Math.random()*7);
            libro.setIdioma(idioma[indice]);
            
            libro.setNombre(nomLibros[i]);
            
            indice = (int) (Math.random()*350)+150;
            libro.setNumeroDePaginas(indice);
            
            indice = (int) (Math.random()*90);
            libro.setVecesSolicitado(indice);
            
        }
        
        
        
        return lista;
    }

    /**
     *
     * @return
     * @throws PersistentException
     */
    public static ArrayList<modelo.Estante> generarEstantes() throws PersistentException {

        ArrayList<modelo.Estante> lista = new ArrayList<>();

       

        for (int i = 1; i < 13; i++) {
            modelo.Estante est = new modelo.Estante();
            int capacidad = (int) (Math.random()*80)+50;
            est.setCapacidadAproximada(capacidad);
            
            
             modelo.Biblioteca bib = modelo.BibliotecaDAO.getBibliotecaByORMID(1);
            
            est.setIdBiblioteca(bib);

            modelo.Categoria categ = modelo.CategoriaDAO.getCategoriaByORMID(i);

            est.setIdCategoria(categ);

            //est.setId(i);

            lista.add(est);

        }

        return lista;
    }

    /**
     *
     * @return
     * @throws PersistentException
     */
    public static modelo.Biblioteca generarBiblioteca() throws PersistentException {

        modelo.Biblioteca b = new modelo.Biblioteca();

        //b.setIdBiblioteca("b01");
        b.setCorreoElectronico("bib@bib.cl");
        b.setDireccion("Av siempreviva");
        b.setNombre("Bib municipal");
        b.setNumeroDeTelefono(2332532);
        b.setPropietario("Juan Arcoiris");

        modelo.Ciudad c = modelo.CiudadDAO.getCiudadByORMID(1);

        b.setIdCiudad(c);

        return b;
    }

    /**
     *
     * @throws PersistentException
     */
    public void createTestData() throws PersistentException {
        PersistentTransaction t = modelo.ProyectoprogramacionavanzadaPersistentManager.instance().getSession().beginTransaction();
        try {
            
            /*modelo.Libro[] modeloLibros = modelo.LibroDAO.listLibroByQuery("vecesSolicitado=5", null);
            
            for (Libro modeloLibro : modeloLibros) {
                System.out.println(modeloLibro.getNombre());
            }*/
            ////////////////////////////////////////////////////////Generar libros
            /*ArrayList<modelo.Libro> listaLibros = generarLibros();
            for (int i = 0; i < listaLibros.size(); i++) {
            modelo.Libro lib = listaLibros.get(i);
            modelo.LibroDAO.save(lib);
            }*/
            ////////////////////////////////////////////////////////
            ////////////////////////////////////////////////////////Generar estantes
            /*ArrayList<modelo.Estante> lista = generarEstantes();
            for (int i = 0; i < lista.size(); i++) {
            modelo.Estante est = lista.get(i);
            modelo.EstanteDAO.save(est);
            }*/
            ////////////////////////////////////////////////////////
            
            
            
            
            
            /////////////////////////////////////////////////////// Ya hay un rerporte xml con bibliotecas
            /*modelo.Biblioteca b = new modelo.Biblioteca();

            b.setIdBiblioteca("b01");
            b.setCorreoElectronico("bib@bib.cl");
            b.setDireccion("Av siempreviva");
            b.setNombre("Bib municipal");
            b.setNumeroDeTelefono(2332532);
            b.setPropietario("Juan Arcoiris");

            modelo.Ciudad c = modelo.CiudadDAO.getCiudadByORMID("1");

            b.setIdCiudad(c);
            
            modelo.BibliotecaDAO.save(b);*/

            //modelo.Libro libro=null;// = modelo.ClienteDAO.getClienteByORMID("131679348");
            /*
            -codigo varchar
            -nombre varchar20 OJO
            -Numero de paginas
            -Disponibilidad varchar16
            -fechaAdquisicion date
            -fechaEdicion date
            -edicion varchar 16 - puede ser null
            -veces solicitado int
            -fechaUltimaSolicitud
            -colorTapa varchar16
            -estadoDeterioro varchar16
            -idioma varchar
            -idEstante CREAR ESTANTE
            -idCategoria CREAR CATEGORIA
             */
            //modelo.LibroDAO.save(libro);
            /*ArrayList<modelo.Estante> lista = generarEstantes();

            modelo.Estante est = lista.get(0);

            modelo.EstanteDAO.save(est);*/
            

            System.out.println("asdsad");
            t.commit();
        } catch (Exception e) {
            e.printStackTrace();
            t.rollback();
        }

    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            CrearLibros createProyectoprogramacionavanzadaData = new CrearLibros();
            try {
                createProyectoprogramacionavanzadaData.createTestData();
            } finally {
                modelo.ProyectoprogramacionavanzadaPersistentManager.instance().disposePersistentManager();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
