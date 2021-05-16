import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

class VistaProducto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; border: #ccc solid 2px; border-radius : 20px; background: radial-gradient(circle, rgba(174,238,236,1) 63%, rgba(239,248,249,1) 100%);">
 <vaadin-vertical-layout style="align-self: center;">
  <vaadin-horizontal-layout>
   <vaadin-horizontal-layout>
    <label style="margin: var(--lumo-space-m);">Producto</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout>
    <vaadin-text-field id="textNombre" style="margin: var(--lumo-space-m);" readonly></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; margin: var(--lumo-space-m);">
  <vaadin-horizontal-layout style="width: 100%;">
   <vaadin-horizontal-layout style="width: 30%;">
    <img id="idFoto" style="width: 80%; height: 80%; margin: var(--lumo-space-m);">
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 70%;">
    <vaadin-text-area id="textDescripcion" style="width: 100%;" readonly></vaadin-text-area>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="margin: var(--lumo-space-m); align-self: center;">
  <vaadin-horizontal-layout style="align-self: center;">
   <vaadin-horizontal-layout>
    <vaadin-horizontal-layout>
     <label style="align-self: center; flex-shrink: 0; margin: var(--lumo-space-m);">Precio: </label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout>
     <vaadin-text-field id="textPrecio" style="align-self: center; margin: var(--lumo-space-m);" readonly></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout>
    <vaadin-button theme="icon" aria-label="Add new" id="buttonAgregarCarrito" style="align-self: center;">
     <iron-icon icon="lumo:plus"></iron-icon>
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-producto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProducto.is, VistaProducto);
