package pl.siwiec.QRcodeGenerator;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.siwiec.event.EventRepository;
import pl.siwiec.present.PresentRepository;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/barcodes")
public class BarcodesController {

    private final EventRepository eventRepository;
    private final PresentRepository presentRepository;

    public BarcodesController(EventRepository eventRepository, PresentRepository presentRepository) {
        this.eventRepository = eventRepository;
        this.presentRepository = presentRepository;
    }


    @GetMapping(value = "/zxing", produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<BufferedImage> zxingQRCode() throws Exception {
        return okResponse(ZXingQRcode.generateQRCodeImage("Nie działa" ));
    }


    private ResponseEntity<BufferedImage> okResponse(BufferedImage image) {
        return new ResponseEntity<>(image, HttpStatus.OK);
    }

    //...
}