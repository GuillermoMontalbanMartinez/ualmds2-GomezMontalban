import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-productos-seleccionados`
 *
 * VistaProductosSeleccionados element.
 *
 * @customElement
 * @polymer
 */
class VistaProductosSeleccionados extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-productos-seleccionados';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductosSeleccionados.is, VistaProductosSeleccionados);
