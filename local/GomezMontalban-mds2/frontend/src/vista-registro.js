import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-select/src/vaadin-select-text-field.js';
import '@vaadin/vaadin-upload/src/vaadin-upload.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaRegistro extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%;">
 <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center; margin: var(--lumo-space-m); flex-shrink: 0;">
  <img style="width: 100%; height: 100%; margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); align-self: center; flex-shrink: 0; align-items: center; justify-content: center; width: 100%;">
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
     <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); width: 100%; align-self: center; flex-shrink: 0; align-items: center; justify-content: center;">
      <vaadin-horizontal-layout theme="spacing" style="align-self: center; align-items: center; justify-content: center; flex-shrink: 0; margin: var(--lumo-space-m);">
       <label style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;">Nombre de usuario</label>
      </vaadin-horizontal-layout>
      <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
       <vaadin-text-field style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;"></vaadin-text-field>
      </vaadin-horizontal-layout>
     </vaadin-horizontal-layout>
     <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; margin: var(--lumo-space-m); align-self: center; align-items: center; justify-content: center;">
      <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
       <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; justify-content: center; align-items: center; align-self: center;">
        <label style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m);">Apellidos</label>
       </vaadin-horizontal-layout>
       <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
        <vaadin-text-field></vaadin-text-field>
       </vaadin-horizontal-layout>
      </vaadin-horizontal-layout>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing">
      <vaadin-horizontal-layout theme="spacing">
       <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
        <label style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;">Correo</label>
       </vaadin-horizontal-layout>
       <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
        <vaadin-text-field></vaadin-text-field>
       </vaadin-horizontal-layout>
      </vaadin-horizontal-layout>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing">
      <vaadin-horizontal-layout theme="spacing">
       <vaadin-horizontal-layout theme="spacing">
        <label>Contraseña</label>
       </vaadin-horizontal-layout>
       <vaadin-horizontal-layout theme="spacing">
        <vaadin-text-field></vaadin-text-field>
       </vaadin-horizontal-layout>
      </vaadin-horizontal-layout>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing">
      <vaadin-horizontal-layout theme="spacing">
       <vaadin-horizontal-layout theme="spacing">
        <label>Repita contraseña</label>
       </vaadin-horizontal-layout>
       <vaadin-horizontal-layout theme="spacing">
        <vaadin-select-text-field></vaadin-select-text-field>
       </vaadin-horizontal-layout>
      </vaadin-horizontal-layout>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing">
      <vaadin-horizontal-layout theme="spacing">
       <vaadin-horizontal-layout theme="spacing">
        <label>Teléfono</label>
       </vaadin-horizontal-layout>
       <vaadin-horizontal-layout theme="spacing">
        <vaadin-text-field></vaadin-text-field>
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
  <vaadin-vertical-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-horizontal-layout theme="spacing">
     <label style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m);">País</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-text-field style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-horizontal-layout theme="spacing">
     <label style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m);">Localidad</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-text-field style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-horizontal-layout theme="spacing">
     <label style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;">Calle</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-text-field style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-horizontal-layout theme="spacing">
     <label style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;">Portal</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-text-field style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-horizontal-layout theme="spacing">
     <label style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;">Provincia</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-text-field style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-horizontal-layout theme="spacing">
     <label style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;">Código postal</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-text-field style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing"></vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center; justify-content: center; flex-shrink: 0; margin: var(--lumo-space-m); width: 100%;">
  <vaadin-vertical-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
     <label>Número de tarjeta</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
     <vaadin-text-field style="margin: var(--lumo-space-m);"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
    <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
     <label style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;">Titular</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
     <vaadin-select-text-field style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;"></vaadin-select-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
     <label style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;">Fecha de caducidad</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m); align-items: center; justify-content: center;">
     <vaadin-text-field></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-horizontal-layout theme="spacing">
      <label>CVV</label>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing">
      <vaadin-text-field></vaadin-text-field>
     </vaadin-horizontal-layout>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m); width: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
    <vaadin-button style="margin: var(--lumo-space-m);" theme="primary error">
     Cancelar
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
    <vaadin-button style="margin: var(--lumo-space-m);" theme="primary">
      Button 
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
