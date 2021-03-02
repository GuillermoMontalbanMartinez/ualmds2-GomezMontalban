import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-compra.js';

class VistaListadoDeCompras extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; ">
 <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
  <vaadin-horizontal-layout theme="spacing">
   <vista-compra style="margin-right: var(--lumo-space-xl); padding-right: var(--lumo-space-xl);"></vista-compra>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing">
   <vista-compra></vista-compra>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
  <vaadin-horizontal-layout theme="spacing" style="margin-top: var(--lumo-space-xl);">
   <vista-compra style="margin-right: var(--lumo-space-xl); padding-right: var(--lumo-space-xl);"></vista-compra>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="margin-top: var(--lumo-space-xl);">
   <vista-compra></vista-compra>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-listado-de-compras';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaListadoDeCompras.is, VistaListadoDeCompras);
