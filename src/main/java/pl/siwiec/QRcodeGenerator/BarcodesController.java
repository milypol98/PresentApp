package pl.siwiec.QRcodeGenerator;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.image.BufferedImage;

@RestController
@RequestMapping("/barcodes")
public class BarcodesController {
//    ResponseEntity<BufferedImage>
//     return okResponse(ZXingQRcode.generateQRCodeImage(barcodes));
    @GetMapping(value = "/QR", produces = MediaType.IMAGE_PNG_VALUE)
    public String  zxingQRCode(String barcodes , Model model) throws Exception {
        model.addAttribute("QRcode" , okResponse(ZXingQRcode.generateQRCodeImage("polska")));
        return "vievers";
    }

    private ResponseEntity<BufferedImage> okResponse(BufferedImage image) {
        return new ResponseEntity<>(image, HttpStatus.OK);
    }

}
