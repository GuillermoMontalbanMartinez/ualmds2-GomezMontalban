package interfaz;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.orm.PersistentException;
import org.w3c.dom.Document;

import com.helger.commons.io.file.FileOperations;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HtmlComponent;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.FileBuffer;
import com.vaadin.flow.component.upload.receivers.FileData;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.component.upload.receivers.MultiFileMemoryBuffer;
import com.vaadin.flow.internal.MessageDigestUtil;
import com.vaadin.flow.server.StreamResource;

import elemental.json.Json;
import src.net.dv8tion.Uploader;
import vistas.VistaDarAltaProducto;

public class Dar_alta_producto extends VistaDarAltaProducto {
	public Administrar_productos _administrar_productos;
	String value, value2, value3, value4, value5;
	String src, src2, src3, src4, src5;
	MultiFileMemoryBuffer buffer = new MultiFileMemoryBuffer();
	Div output = new Div();

	public Dar_alta_producto() {

		this.getUploadPrincipal().setReceiver(buffer);
		this.getUpload2().setReceiver(buffer);
		this.getUpload3().setReceiver(buffer);
		this.getUpload4().setReceiver(buffer);
		this.getUpload5().setReceiver(buffer);

		this.getButtonAceptar().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				try {
					Alta_producto();

				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

		// UPLOADER PRINCIPAL
		this.getUploadPrincipal().addSucceededListener(event -> {

			value = event.getFileName();
			try {
				BufferedImage inputImage = ImageIO.read(buffer.getInputStream(value));
				ImageIO.write(inputImage, "png", new File("temp/" + value));

				JSONObject myJson = new JSONObject(Uploader.upload(new File("temp/" + value)));
				JSONObject myJson2 = new JSONObject(myJson.get("data").toString());
				src = myJson2.get("link").toString();

				if (src != null)
					this.getImgPrincipal().setSrc(src);
				this.getImgPrincipal().setVisible(true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});

		this.getUploadPrincipal().addFileRejectedListener(event -> {
			Paragraph component = new Paragraph();
			output.removeAll();
			showOutput(event.getErrorMessage(), component, output);
		});

		this.getUploadPrincipal().getElement().addEventListener("file-remove", event -> {
			this.getImgPrincipal().setVisible(false);
		});

		getButtonCancelar().addClickListener(event -> {
			borrar_datos();
		});

		// UPLOADER2
		this.getUpload2().addSucceededListener(event -> {

			value2 = event.getFileName();
			try {
				BufferedImage inputImage = ImageIO.read(buffer.getInputStream(value2));
				ImageIO.write(inputImage, "png", new File("temp/" + value2));

				JSONObject myJson = new JSONObject(Uploader.upload(new File("temp/" + value2)));
				JSONObject myJson2 = new JSONObject(myJson.get("data").toString());
				src2 = myJson2.get("link").toString();

				if (src2 != null)
					this.getIm2().setSrc(src2);
				this.getIm2().setVisible(true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});

		this.getUpload2().addFileRejectedListener(event -> {
			Paragraph component = new Paragraph();
			output.removeAll();
			showOutput(event.getErrorMessage(), component, output);
		});

		this.getUpload2().getElement().addEventListener("file-remove", event -> {
			this.getIm2().setVisible(false);
		});

		// UPLOADER3
		this.getUpload3().addSucceededListener(event -> {

			value3 = event.getFileName();
			try {
				BufferedImage inputImage = ImageIO.read(buffer.getInputStream(value3));
				ImageIO.write(inputImage, "png", new File("temp/" + value3));

				JSONObject myJson = new JSONObject(Uploader.upload(new File("temp/" + value3)));
				JSONObject myJson2 = new JSONObject(myJson.get("data").toString());
				src3 = myJson2.get("link").toString();

				if (src3 != null)
					this.getImg3().setSrc(src3);
				this.getImg3().setVisible(true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});

		this.getUpload3().addFileRejectedListener(event -> {
			Paragraph component = new Paragraph();
			output.removeAll();
			showOutput(event.getErrorMessage(), component, output);
		});

		this.getUpload3().getElement().addEventListener("file-remove", event -> {
			this.getImg3().setVisible(false);
		});

		// UPLOADER4
		this.getUpload4().addSucceededListener(event -> {

			value4 = event.getFileName();
			try {
				BufferedImage inputImage = ImageIO.read(buffer.getInputStream(value4));
				ImageIO.write(inputImage, "png", new File("temp/" + value4));

				JSONObject myJson = new JSONObject(Uploader.upload(new File("temp/" + value4)));
				JSONObject myJson2 = new JSONObject(myJson.get("data").toString());
				src4 = myJson2.get("link").toString();

				if (src4 != null)
					this.getImg4().setSrc(src4);
				this.getImg4().setVisible(true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});

		this.getUpload4().addFileRejectedListener(event -> {
			Paragraph component = new Paragraph();
			output.removeAll();
			showOutput(event.getErrorMessage(), component, output);
		});

		this.getUpload4().getElement().addEventListener("file-remove", event -> {
			this.getImg4().setVisible(false);
		});

		// UPLOADER5

		this.getUpload5().addSucceededListener(event -> {

			value5 = event.getFileName();
			try {
				BufferedImage inputImage = ImageIO.read(buffer.getInputStream(value5));
				ImageIO.write(inputImage, "png", new File("temp/" + value5));

				JSONObject myJson = new JSONObject(Uploader.upload(new File("temp/" + value5)));
				JSONObject myJson2 = new JSONObject(myJson.get("data").toString());
				src5 = myJson2.get("link").toString();

				if (src5 != null)
					this.getImg4().setSrc(src5);
				this.getImg5().setVisible(true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});

		this.getUpload5().addFileRejectedListener(event -> {
			Paragraph component = new Paragraph();
			output.removeAll();
			showOutput(event.getErrorMessage(), component, output);
		});

		this.getUpload5().getElement().addEventListener("file-remove", event -> {
			this.getImg5().setVisible(false);
		});

	}

	public void Alta_producto() throws PersistentException {

		borrar_datos();
	}

	public void borrar_datos() {
		this.getUploadPrincipal().getElement().setPropertyJson("files", Json.createArray());
		this.getImgPrincipal().setVisible(false);

		this.getUpload2().getElement().setPropertyJson("files", Json.createArray());
		this.getIm2().setVisible(false);

		this.getUpload3().getElement().setPropertyJson("files", Json.createArray());
		this.getImg3().setVisible(false);

		this.getUpload4().getElement().setPropertyJson("files", Json.createArray());
		this.getImg4().setVisible(false);

		this.getUpload5().getElement().setPropertyJson("files", Json.createArray());
		this.getImg5().setVisible(false);
	}

	public Administrar_productos get_administrar_productos() {
		return _administrar_productos;
	}

	public void set_administrar_productos(Administrar_productos _administrar_productos) {
		this._administrar_productos = _administrar_productos;
	}

	// METODOS AUXILIARES

	private Component createTextComponent(InputStream stream) {
		String text;
		try {
			text = IOUtils.toString(stream, StandardCharsets.UTF_8);
		} catch (IOException e) {
			text = "exception reading stream";
		}
		return new Text(text);
	}

	private void showOutput(String text, Component content, HasComponents outputContainer) {
		HtmlComponent p = new HtmlComponent(Tag.P);
		p.getElement().setText(text);
		outputContainer.add(p);
		outputContainer.add(content);
	}
}