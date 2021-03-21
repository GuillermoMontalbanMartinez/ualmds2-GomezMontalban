import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-select/src/vaadin-select-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-upload/src/vaadin-upload.js';

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
 <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center; width: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); width: 70%;">
   <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m);">
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-horizontal-layout theme="spacing">
      <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin-right: var(--lumo-space-l);">
       <label style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;">Nombre</label>
      </vaadin-horizontal-layout>
      <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m);">
       <vaadin-text-field style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m);"></vaadin-text-field>
      </vaadin-horizontal-layout>
     </vaadin-horizontal-layout>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-horizontal-layout theme="spacing">
      <vaadin-horizontal-layout theme="spacing" style="margin-right: var(--lumo-space-l);">
       <label style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;">Precio</label>
      </vaadin-horizontal-layout>
      <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); margin-left: var(--lumo-space-xl);">
       <vaadin-text-field style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m);"></vaadin-text-field>
      </vaadin-horizontal-layout>
     </vaadin-horizontal-layout>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-horizontal-layout theme="spacing">
      <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
       <label style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m); margin-right: var(--lumo-space-l);">ID Producto</label>
      </vaadin-horizontal-layout>
      <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin-left: var(--lumo-space-s);">
       <vaadin-select-text-field style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m); margin-left: var(--lumo-space-s);"></vaadin-select-text-field>
      </vaadin-horizontal-layout>
     </vaadin-horizontal-layout>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); height: 100%; width: 100%;">
    <vaadin-vertical-layout theme="spacing">
     <h4 style="flex-shrink: 0; align-self: center;">Descripción</h4>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 100%;">
     <vaadin-text-area style="height: 75%; width: 100%; flex-shrink: 0; align-self: center;"></vaadin-text-area>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-xl); flex-shrink: 0; width: 100%; align-self: center; justify-content: center;">
  <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; margin: var(--lumo-space-xl); align-self: center; padding: var(--lumo-space-xl);">
   <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m);">
    <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; margin: var(--lumo-space-m); flex-shrink: 1; align-self: center;">
     <h4>Foto principal</h4>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); width: 100%; height: 70%; flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
     <img style="width: 100%; flex-shrink: 1; align-self: center; height: 100%;">
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m); width: 100%;">
     <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); width: 100%;">
      <vaadin-upload style="flex-shrink: 0; align-self: center; width: 100%;"></vaadin-upload>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 50%; height: 100%;">
    <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-shrink: 0; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
     <h4 style="margin: var(--lumo-space-m); align-self: center; flex-shrink: 0;">Fotos secundarias</h4>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-shrink: 0; align-items: center; justify-content: center; margin: var(--lumo-space-m); width: 100%; height: 50%;">
     <vaadin-vertical-layout theme="spacing">
      <vaadin-horizontal-layout theme="spacing" style="align-self: center; margin: var(--lumo-space-m); align-items: center; justify-content: center;">
       <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m); height: 100%; width: 100%;">
        <img style="width: 100%; flex-shrink: 0; align-self: center; height: 100%; margin: var(--lumo-space-m);">
       </vaadin-horizontal-layout>
       <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m); height: 100%;">
        <img style="width: 100%; flex-shrink: 0; align-self: center; height: 100%; margin: var(--lumo-space-m);">
       </vaadin-horizontal-layout>
      </vaadin-horizontal-layout>
      <vaadin-vertical-layout theme="spacing">
       <vaadin-horizontal-layout theme="spacing">
        <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
         <vaadin-upload style="width: 100%;"></vaadin-upload>
        </vaadin-horizontal-layout>
        <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
         <vaadin-upload style="width: 100%;"></vaadin-upload>
        </vaadin-horizontal-layout>
       </vaadin-horizontal-layout>
      </vaadin-vertical-layout>
     </vaadin-vertical-layout>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m); width: 100%; height: 50%;">
     <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
      <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-shrink: 0; align-self: center; align-items: center; justify-content: center; height: 100%; margin: var(--lumo-space-m);">
       <img style="width: 100%; flex-shrink: 0; align-self: center; height: 100%; margin: var(--lumo-space-m);">
      </vaadin-horizontal-layout>
      <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-shrink: 0; align-self: center; align-items: center; justify-content: center; height: 100%; margin: var(--lumo-space-m);">
       <img style="width: 100%; align-self: center; flex-shrink: 0; height: 100%; margin: var(--lumo-space-m);">
      </vaadin-horizontal-layout>
     </vaadin-horizontal-layout>
     <vaadin-vertical-layout theme="spacing">
      <vaadin-horizontal-layout theme="spacing">
       <vaadin-horizontal-layout theme="spacing">
        <vaadin-upload></vaadin-upload>
       </vaadin-horizontal-layout>
       <vaadin-horizontal-layout theme="spacing">
        <vaadin-upload></vaadin-upload>
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
    <vaadin-button theme="primary">
      Cancelar 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; margin: var(--lumo-space-m);">
    <vaadin-button style="width: 100%;" theme="primary">
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
