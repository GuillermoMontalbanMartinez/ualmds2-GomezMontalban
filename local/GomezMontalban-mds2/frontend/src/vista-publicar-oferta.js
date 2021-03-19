import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaPublicarOferta extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; width: 100%;">
  <h1 style="align-self: center; flex-shrink: 0;">Añadir ofertas</h1>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-shrink: 0;">
  <vaadin-vertical-layout theme="spacing" style="align-self: center;">
   <h4 style="align-self: flex-start; flex-shrink: 0;">Oferta de productos</h4>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m);">
     <label style="width: 100%; flex-shrink: 0; align-self: center; margin: var(--lumo-space-m);">ID Producto</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m);">
     <vaadin-text-field style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m);"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); align-self: center; flex-shrink: 0; align-items: center; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
    <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
     <label style="margin: var(--lumo-space-m);">Descuento</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m);">
     <vaadin-text-field style="margin: var(--lumo-space-m);"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
    <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
     <label style="margin: var(--lumo-space-m);">Fecha limite</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
     <vaadin-text-field style="margin: var(--lumo-space-m); align-self: center; flex-shrink: 0;"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
  <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); align-items: center; justify-content: center; flex-shrink: 0; align-self: center;">
    <vaadin-button style="align-self: center; flex-shrink: 0;" theme="primary">
     Publicar oferta
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); align-items: center; align-self: center; flex-shrink: 0; justify-content: center;">
    <vaadin-button style="align-self: center; flex-shrink: 0;" theme="primary">
     Cancelar
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
  <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); align-items: center; justify-content: center; align-self: center; flex-shrink: 0;">
   <h4 style="margin: var(--lumo-space-m); align-self: center; flex-shrink: 0;">Oferta de categoría</h4>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-horizontal-layout theme="spacing">
     <label>ID Categoría</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-combo-box></vaadin-combo-box>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m);">
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m);">
    <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
     <label style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;">Descuento</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); align-self: center; align-items: center; justify-content: center; flex-shrink: 0;">
     <vaadin-text-field style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
     <label style="margin: var(--lumo-space-m);">Fecha límite</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
     <vaadin-text-field style="margin: var(--lumo-space-m);"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-button style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;" theme="primary">
      Publicar oferta
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-button style="margin: var(--lumo-space-m);" theme="primary">
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
        return 'vista-publicar-oferta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPublicarOferta.is, VistaPublicarOferta);
