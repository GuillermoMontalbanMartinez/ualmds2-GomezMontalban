import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-upload/src/vaadin-upload.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaDarAltaProducto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayoutAltaProducto">
 <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center; justify-content: center; flex-shrink: 0; margin: var(--lumo-space-m);">
  <h1>Dar alta producto</h1>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; width: 100%; align-self: center; align-items: center;">
  <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); width: 70%;">
   <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m);">
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-horizontal-layout theme="spacing">
      <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin-right: var(--lumo-space-l);">
       <label style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;font-weight: bold;">Nombre</label>
      </vaadin-horizontal-layout>
      <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m);">
       <vaadin-text-field style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m);" id="textNombre" autofocus></vaadin-text-field>
      </vaadin-horizontal-layout>
     </vaadin-horizontal-layout>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-horizontal-layout theme="spacing">
      <vaadin-horizontal-layout theme="spacing" style="margin-right: var(--lumo-space-l);">
       <label style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;font-weight: bold;">Precio</label>
      </vaadin-horizontal-layout>
      <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); margin-left: var(--lumo-space-xl);">
       <vaadin-text-field style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m);" id="textPrecio"></vaadin-text-field>
      </vaadin-horizontal-layout>
     </vaadin-horizontal-layout>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout>
     <vaadin-horizontal-layout style="margin-right: var(--lumo-space-xl);">
      <label style="margin: var(--lumo-space-m)flex-shrink: 0; align-self: center;font-weight: bold;">Categoria</label>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout id="textCategoria"></vaadin-horizontal-layout>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing-xs" style="margin: var(--lumo-space-m); height: 100%; width: 100%;">
    <vaadin-vertical-layout theme="spacing">
     <h4 style="flex-shrink: 0; align-self: center;">Descripción</h4>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 100%;">
     <vaadin-text-area style="height: 100%; width: 100%; flex-shrink: 0; align-self: center; " id="textArea" maxlength="255"></vaadin-text-area>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-xl); flex-shrink: 0; width: 100%; align-self: center; justify-content: center;">
  <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; margin: var(--lumo-space-m); align-self: center; padding: var(--lumo-space-m); width: 100%; height: 100%;">
   <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m);">
    <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; margin: var(--lumo-space-m); flex-shrink: 1; align-self: center;">
     <h4>Foto principal</h4>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); width: 100%; height: 70%; flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
     <img style="width: 50%; flex-shrink: 1; align-self: center; height: 50%;" id="imgPrincipal">
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m); width: 100%;">
     <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); width: 100%;">
      <vaadin-upload style="flex-shrink: 0; align-self: center; width: 80%;" id="uploadPrincipal"></vaadin-upload>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 50%; height: 100%; align-items: flex-end;">
    <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-shrink: 0; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
     <h4 style="margin: var(--lumo-space-m); align-self: center; flex-shrink: 0;">Fotos secundarias</h4>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-shrink: 0; align-items: center; justify-content: center; margin: var(--lumo-space-m); width: 100%; height: 50%;">
     <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center; justify-content: center;">
      <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); align-self: center; align-items: center; justify-content: center;">
       <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m); height: 100%; width: 100%;">
        <img style="width: 35%; flex-shrink: 0; align-self: center; height: 35%; margin: var(--lumo-space-m);" id="im2">
       </vaadin-horizontal-layout>
       <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m); height: 100%;">
        <img style="width: 25%; flex-shrink: 0; align-self: center; height: 25%; margin: var(--lumo-space-m);" id="img3">
       </vaadin-horizontal-layout>
      </vaadin-horizontal-layout>
      <vaadin-vertical-layout theme="spacing">
       <vaadin-horizontal-layout theme="spacing">
        <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
         <vaadin-upload style="width: 100%;" id="upload2"></vaadin-upload>
        </vaadin-horizontal-layout>
        <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
         <vaadin-upload style="width: 100%;" id="upload3"></vaadin-upload>
        </vaadin-horizontal-layout>
       </vaadin-horizontal-layout>
      </vaadin-vertical-layout>
     </vaadin-vertical-layout>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; width: 100%; height: 50%; margin: var(--lumo-space-m);">
     <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
      <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-shrink: 0; align-self: center; align-items: center; justify-content: center; height: 100%; margin: var(--lumo-space-m);">
       <img style="width: 35%; flex-shrink: 0; align-self: center; height: 35%; margin: var(--lumo-space-m);" id="img4">
      </vaadin-horizontal-layout>
      <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-shrink: 0; align-self: center; align-items: center; justify-content: center; height: 100%; margin: var(--lumo-space-m);">
       <img style="width: 35%; align-self: center; flex-shrink: 0; height: 35%; margin: var(--lumo-space-m);" id="img5">
      </vaadin-horizontal-layout>
     </vaadin-horizontal-layout>
     <vaadin-vertical-layout theme="spacing">
      <vaadin-horizontal-layout theme="spacing">
       <vaadin-horizontal-layout theme="spacing">
        <vaadin-upload id="upload4" style="width: 100%;"></vaadin-upload>
       </vaadin-horizontal-layout>
       <vaadin-horizontal-layout theme="spacing">
        <vaadin-upload id="upload5" style="width: 100%;"></vaadin-upload>
       </vaadin-horizontal-layout>
      </vaadin-horizontal-layout>
     </vaadin-vertical-layout>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center; justify-content: center; flex-shrink: 0; width: 100%; margin: var(--lumo-space-m);">
  <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m);">
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m);">
    <vaadin-button theme="primary error" id="ButtonCancelar">
      Cancelar 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; margin: var(--lumo-space-m);">
    <vaadin-button style="width: 100%;" theme="primary" id="ButtonAceptar">
      Aceptar 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-dar-alta-producto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaDarAltaProducto.is, VistaDarAltaProducto);
