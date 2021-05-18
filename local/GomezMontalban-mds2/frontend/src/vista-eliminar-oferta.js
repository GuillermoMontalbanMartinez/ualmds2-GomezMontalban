import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

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
  <vaadin-vertical-layout style="align-items: center; justify-content: flex-end; align-self: center; flex-shrink: 0; width: 100%;">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 1;">
     <label style="font-weight: bold; margin: var(--lumo-space-m);" id="textHorizotalLayoutNombreProductoEliminarOferta">Nombre Producto</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" id="textComboBoxEliminarOferta"></vaadin-horizontal-layout>
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
