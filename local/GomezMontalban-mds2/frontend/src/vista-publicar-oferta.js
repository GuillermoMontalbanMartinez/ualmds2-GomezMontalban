import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-date-picker/src/vaadin-date-picker.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;background: rgb(174,238,236);
background: radial-gradient(circle, rgba(174,238,236,1) 63%, rgba(239,248,249,1) 100%);" id="VerticalLayoutPublicarOfertas">
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; width: 100%;background: rgb(174,238,236);
background: radial-gradient(circle, rgba(174,238,236,1) 63%, rgba(239,248,249,1) 100%);">
  <h1 style="align-self: center; flex-shrink: 0;">Añadir ofertas</h1>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-shrink: 0;">
  <vaadin-vertical-layout theme="spacing" style="align-self: center;">
   <h4 style="align-self: flex-start; flex-shrink: 0;">Oferta de productos</h4>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout>
   <vaadin-horizontal-layout>
    <vaadin-horizontal-layout style="margin-left: var(--lumo-space-xl);">
     <label style="width: 100%; flex-shrink: 0; align-self: center; margin-right: var(--lumo-space-xl);font-weight: bold;">Nombre </label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout id="textNombreProductoOferta"></vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="align-self: center; flex-shrink: 0; align-items: center; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
    <vaadin-horizontal-layout style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
     <label style="margin: var(--lumo-space-m);font-weight: bold;">Descuento</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout>
     <vaadin-text-field style="margin: var(--lumo-space-m);" id="textDescuentoOferta"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
   <vaadin-horizontal-layout style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
    <vaadin-horizontal-layout style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
     <label style="font-weight: bold;">Fecha limite</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
     <vaadin-date-picker id="textFechaLimiteOfertaProducto"></vaadin-date-picker>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
  <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); align-items: center; justify-content: center; flex-shrink: 0; align-self: center;">
    <vaadin-button style="align-self: center; flex-shrink: 0;" theme="primary" id="ButtonPublicarOferta">
      Publicar oferta 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); align-items: center; align-self: center; flex-shrink: 0; justify-content: center;">
    <vaadin-button style="align-self: center; flex-shrink: 0;" theme="primary error" id="ButtonCancelar">
      Cancelar 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
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
