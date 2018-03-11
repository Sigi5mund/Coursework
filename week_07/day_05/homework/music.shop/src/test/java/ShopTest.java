import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Drum drum;
    Keyboard keyboard;
    Songbook songbook;
    DrumSticks drumSticks;
    GuitarStrings guitarStrings;


    @Before
    public void setUp(){
        shop = new Shop("Ray Mear's Music Exchange");
        guitar = new Guitar(InstrumentType.String,"Wood", 100, 250, 6 );
        drum = new Drum(InstrumentType.Percussion, "Metal", 500, 750, 6);
        keyboard = new Keyboard(InstrumentType.Keyboard, "Plastic", 300, 450, 30);
        songbook = new Songbook("Red Hot Chilli Peppers", "Californication", 8, 15);
        drumSticks = new DrumSticks("Drummer Master", "it takes two baby!", 10, 30);
        guitarStrings = new GuitarStrings("Strummer", "G", 2, 6);
    }

    @Test
    public void drumHasAttributes(){
        assertEquals(6, drum.numberOfDrums);
        assertEquals("Metal", drum.getMaterial());
        assertEquals(500, drum.getBuy());
        assertEquals(750, drum.getSell());
    }

    @Test
    public void drumSticksHasAttributes(){
        assertEquals("it takes two baby!", drumSticks.getDesc());
        assertEquals("Drummer Master", drumSticks.getName());
        assertEquals(10, drumSticks.getBuy());
    }

    @Test
    public void instrumentsPlay(){
        assertEquals("Guitar: Plays", guitar.play());
        assertEquals("Drum bangs", drum.play());
        assertEquals("Piano: Plays", keyboard.play());
    }



    @Test
    public void songbookHasCost(){
        assertEquals(15, songbook.getSell());
    }



    @Test
    public void canTotalForArray(){
        shop = new Shop("Ray Mear's Music Exchange");
        shop.stock.add(guitar);
        shop.stock.add(drum);
        shop.stock.add(keyboard);
        shop.stock.add(songbook);
        shop.stock.add(drumSticks);
        shop.stock.add(guitarStrings);
        assertEquals(581, shop.totalShop());

    }


    @Test
    public void canGetStockInArray(){
        ISell guitar1;
        shop = new Shop("Ray Mear's Music Exchange");
        shop.stock.add(guitar);
        shop.stock.add(drum);
        shop.stock.add(keyboard);
        shop.stock.add(songbook);
        shop.stock.add(drumSticks);
        shop.stock.add(guitarStrings);
        guitar1 = shop.stock.get(0);
        assertEquals(150, guitar1.calcMarkUp());

    }
}
