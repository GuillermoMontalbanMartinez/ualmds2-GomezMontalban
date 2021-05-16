import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-upload/src/vaadin-upload.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-date-picker/src/vaadin-date-picker.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class VistaRegistro extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%;
background: rgb(174,238,236);
background: radial-gradient(circle, rgba(174,238,236,1) 63%, rgba(239,248,249,1) 100%);">
 <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center; margin: var(--lumo-space-m); flex-shrink: 0;">
  <img style="width: 100%; height: 100%; margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); align-self: center; flex-shrink: 0; align-items: center; justify-content: center; width: 100%;">
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
     <vaadin-horizontal-layout style="width: 100%; align-self: center; flex-shrink: 0; align-items: center; justify-content: center;">
      <vaadin-horizontal-layout style="align-self: center; align-items: center; justify-content: center; flex-shrink: 0;">
       <label style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;font-weight: bold;">Nombre de usuario</label>
      </vaadin-horizontal-layout>
      <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
       <vaadin-text-field style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;" id="textNombreUsuario"></vaadin-text-field>
      </vaadin-horizontal-layout>
     </vaadin-horizontal-layout>
     <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; margin: var(--lumo-space-m); align-self: center; align-items: center; justify-content: center;">
      <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
       <vaadin-horizontal-layout style="flex-shrink: 0; justify-content: center; align-items: center; align-self: center;">
        <label style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m);font-weight: bold;">Apellidos</label>
       </vaadin-horizontal-layout>
       <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
        <vaadin-text-field id="textApellidos"></vaadin-text-field>
       </vaadin-horizontal-layout>
      </vaadin-horizontal-layout>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing">
      <vaadin-horizontal-layout>
       <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
        <label style="flex-shrink: 0; align-self: center; font-weight: bold;">Correo</label>
       </vaadin-horizontal-layout>
       <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
        <vaadin-text-field id="textCorreo"></vaadin-text-field>
       </vaadin-horizontal-layout>
      </vaadin-horizontal-layout>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing">
      <vaadin-horizontal-layout style="align-self: center;">
       <vaadin-horizontal-layout style="align-self: center; justify-content: center;">
        <label style="font-weight: bold; margin: var(--lumo-space-m);">Contraseña</label>
       </vaadin-horizontal-layout>
       <vaadin-horizontal-layout theme="spacing">
        <vaadin-password-field id="textPassword"></vaadin-password-field>
       </vaadin-horizontal-layout>
      </vaadin-horizontal-layout>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing">
      <vaadin-horizontal-layout theme="spacing">
       <vaadin-horizontal-layout theme="spacing">
        <label style="font-weight: bold;">Repita contraseña</label>
       </vaadin-horizontal-layout>
       <vaadin-horizontal-layout theme="spacing">
        <vaadin-password-field id="textRepetirPassword"></vaadin-password-field>
       </vaadin-horizontal-layout>
      </vaadin-horizontal-layout>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing">
      <vaadin-horizontal-layout theme="spacing">
       <vaadin-horizontal-layout theme="spacing">
        <label style="font-weight: bold;">Teléfono</label>
       </vaadin-horizontal-layout>
       <vaadin-horizontal-layout theme="spacing">
        <vaadin-text-field id="textTelefono"></vaadin-text-field>
       </vaadin-horizontal-layout>
      </vaadin-horizontal-layout>
     </vaadin-vertical-layout>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-vertical-layout theme="spacing">
     <vaadin-vertical-layout theme="spacing">
      <h4>Foto de perfil</h4>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing">
      <img style="margin: var(--lumo-space-m); width: 100%; height: 100%; align-self: center; flex-shrink: 0;">
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing">
      <vaadin-upload></vaadin-upload>
     </vaadin-vertical-layout>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-items: center; justify-content: center; align-self: center; flex-shrink: 0; margin: var(--lumo-space-m); width: 100%;">
  <vaadin-vertical-layout>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-horizontal-layout theme="spacing">
     <label style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m);font-weight: bold;">País</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-text-field style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;" id="textPais"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-horizontal-layout theme="spacing">
     <label style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m);font-weight: bold;">Localidad</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-text-field style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;" id="textLocalidad"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-horizontal-layout theme="spacing">
     <label style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;font-weight: bold;">Calle</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-text-field style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;" id="textCalle"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-horizontal-layout theme="spacing; font-weight: bold;">
     <label style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;font-weight: bold;">Portal</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-text-field style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;" id="textPortal"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-horizontal-layout theme="spacing">
     <label style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;font-weight: bold;">Provincia</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-text-field style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;" id="textProvincia"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-horizontal-layout theme="spacing">
     <label style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;font-weight: bold;">Código postal</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-text-field style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;" id="textCodigoPostal"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center;">
  <h4 style="align-self: center;">Datos Bancarios </h4>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center; justify-content: center; flex-shrink: 0; margin: var(--lumo-space-m); width: 100%;">
  <vaadin-vertical-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
     <label style="font-weight: bold;">Número de tarjeta</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
     <vaadin-text-field style="margin: var(--lumo-space-m);" id="textNumeroTarjeta"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
    <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
     <label style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;font-weight: bold;">Titular</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
     <vaadin-text-field id="textTitularTarjeta"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
     <label style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;font-weight: bold;">Fecha de caducidad</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m); align-items: center; justify-content: center;">
     <vaadin-date-picker id="textFechaCaducidad"></vaadin-date-picker>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-horizontal-layout theme="spacing">
      <label style="font-weight: bold;">CVV</label>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing">
      <vaadin-text-field id="textCVVTarjeta"></vaadin-text-field>
     </vaadin-horizontal-layout>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m); width: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
    <vaadin-button style="margin: var(--lumo-space-m);" theme="primary error" id="ButtonCancelar">
      Cancelar 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
    <vaadin-button style="margin: var(--lumo-space-m);" theme="primary" id="ButtonRegistro">
      Confirmar 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-registro';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaRegistro.is, VistaRegistro);
