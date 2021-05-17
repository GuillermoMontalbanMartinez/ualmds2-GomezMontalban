import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-upload/src/vaadin-upload.js';
import './vista-modificar-datos-de-compra.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaModificarDatosPersonales extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout>
 <h1>Modificar datos personales</h1>
 <vaadin-vertical-layout theme="spacing" style="width: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
   <vaadin-horizontal-layout theme="spacing" style="width: 40%;">
    <vaadin-vertical-layout theme="spacing">
     <h2>Datos de usuario</h2>
     <vaadin-horizontal-layout theme="spacing" style="align-self: center; width: 100%;">
      <h4>Nombre de usuario</h4>
      <vaadin-text-field style="align-self: center;" id="textNombreDeUsuario"></vaadin-text-field>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="align-items: center; width: 100%;">
      <h4 style="flex-grow: 1;">Apellidos</h4>
      <vaadin-text-field style="flex-grow: 0;" id="textApellidos"></vaadin-text-field>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="align-items: center; width: 100%;">
      <h4 style="flex-grow: 1;">Correo</h4>
      <vaadin-text-field id="textCorreo"></vaadin-text-field>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="align-items: center; width: 100%;">
      <h4 style="flex-grow: 1;">Contraseña</h4>
      <vaadin-text-field id="textPassword"></vaadin-text-field>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="align-items: center;">
      <h4>Repetir contraseña</h4>
      <vaadin-text-field id="textRepeatPassword"></vaadin-text-field>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="align-items: center; width: 100%;">
      <h4 style="flex-grow: 1;">Teléfono</h4>
      <vaadin-text-field id="textTelefono"></vaadin-text-field>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
    <vaadin-vertical-layout theme="spacing" style="width: 100%; align-items: center;">
     <h2>Foto de perfil</h2>
     <vaadin-vertical-layout theme="spacing" style="width: 50%; height: 50%;">
      <img style="width: 100%; height: 100%;" id="imagen">
     </vaadin-vertical-layout>
     <vaadin-upload id="uploader"></vaadin-upload>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="margin-top: var(--lumo-space-xl); width: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
   <vaadin-horizontal-layout theme="spacing" style="width: 50%;">
    <vaadin-vertical-layout theme="spacing" style="width: 80%;">
     <h2>Datos de envio</h2>
     <vaadin-horizontal-layout theme="spacing" style="align-items: center; width: 100%;">
      <h4 style="flex-grow: 1;">Pais</h4>
      <vaadin-text-field id="textPais"></vaadin-text-field>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="align-items: center; width: 100%;">
      <h4 style="flex-grow: 1;">Localidad</h4>
      <vaadin-text-field id="textLocalidad"></vaadin-text-field>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="align-items: center; width: 100%;">
      <h4 style="flex-grow: 1;">Calle</h4>
      <vaadin-text-field id="textCalle"></vaadin-text-field>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="align-items: center; width: 100%;">
      <h4 style="flex-grow: 1;">Portal</h4>
      <vaadin-text-field id="textPortal"></vaadin-text-field>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="align-items: center; width: 100%;">
      <h4 style="flex-grow: 1;">Provincia</h4>
      <vaadin-text-field id="textProvincia"></vaadin-text-field>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="align-items: center; width: 100%;">
      <h4 style="flex-grow: 1;">Código postal</h4>
      <vaadin-text-field id="textCogidoPostal"></vaadin-text-field>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
    <vista-modificar-datos-de-compra style="height: 100%; width: 100%;" id="vistaDatosDePago"></vista-modificar-datos-de-compra>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; width: 40%; align-items: center; justify-content: center; margin-top: var(--lumo-space-xl);">
  <vaadin-button theme="primary error" style="width: 40%;" id="buttonCancelar">
    Cancelar 
  </vaadin-button>
  <vaadin-button theme="primary" style="width: 40%;" id="textGuardarCambios">
    Guardar cambios 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-modificar-datos-personales';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaModificarDatosPersonales.is, VistaModificarDatosPersonales);
