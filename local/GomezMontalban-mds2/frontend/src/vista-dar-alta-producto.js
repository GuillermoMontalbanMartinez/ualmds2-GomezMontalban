import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-dar-alta-producto`
 *
 * VistaDarAltaProducto element.
 *
 * @customElement
 * @polymer
 */
class VistaDarAltaProducto extends PolymerElement {

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
        return 'vista-dar-alta-producto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaDarAltaProducto.is, VistaDarAltaProducto);
