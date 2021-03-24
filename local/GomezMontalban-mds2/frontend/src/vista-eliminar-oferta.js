import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-select/src/vaadin-select-text-field.js';
import '@vaadin/vaadin-time-picker/src/vaadin-time-picker-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class VistaEliminarOferta extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="VerticalLayoutEliminarOferta">
 <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-shrink: 0; align-items: center; justify-content: center;">
  <h1 style="flex-shrink: 0; align-self: center; width: 100%;">Eliminar oferta</h1>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%;">
  <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: flex-end; width: 100%; margin: var(--lumo-space-m);">
   <h4 style="align-self: center; flex-shrink: 0;">Oferta producto</h4>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-items: center; justify-content: flex-end; align-self: center; flex-shrink: 0; margin: var(--lumo-space-m); width: 100%;">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-horizontal-layout theme="spacing">
     <label>ID Producto</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-combo-box></vaadin-combo-box>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: flex-end; margin: var(--lumo-space-m); width: 100%;">
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
    <vaadin-horizontal-layout theme="spacing">
     <label>Descuento</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-select-text-field></vaadin-select-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-shrink: 0; align-items: center; justify-content: flex-end; margin: var(--lumo-space-m); width: 100%;">
   <vaadin-horizontal-layout theme="spacing" style="align-items: center; justify-content: center; align-self: center; flex-shrink: 0;">
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
     <label>Fecha limite</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
     <vaadin-time-picker-text-field></vaadin-time-picker-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-button style="flex-shrink: 0; align-self: center;" theme="primary" id="ButtonEliminarOfertaProducto">
      Eliminar 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-button style="flex-shrink: 0; align-self: center;" theme="primary error" id="ButtonCancelarOfertaProducto">
      Cancelar 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-shrink: 0; align-items: center; justify-content: center;">
  <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-items: center; justify-content: center; align-self: center;">
   <h4 style="flex-shrink: 0; align-self: center;">Oferta categoría</h4>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-shrink: 0; align-items: center; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); align-items: center; justify-content: center; align-self: center; flex-shrink: 0;">
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
     <label>ID Categoría</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
     <vaadin-combo-box></vaadin-combo-box>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-items: center; justify-content: center; align-self: center; margin: var(--lumo-space-m);">
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
     <label style="flex-shrink: 0; align-self: center;">Descuento</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
     <vaadin-text-field></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-horizontal-layout theme="spacing">
     <label style="flex-shrink: 0; align-self: center;">Fecha limite</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-text-field style="flex-shrink: 0; align-self: center;"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-button style="align-self: center; flex-shrink: 0;" theme="primary" id="ButtonElminarOfertaCategoria">
       Eliminar 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-button theme="primary error" id="ButtonCancelarOfertaCategoria" style="flex-shrink: 0; align-self: center;">
       Cancelar 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-eliminar-oferta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEliminarOferta.is, VistaEliminarOferta);
